# Metamodel conflicts management

### Overview

Taking into consideration any versioning system for collaborative modeling, a common problem to face is the conflicts resolution as part of merge operations. Most of the solutions to this problem propose to resolve conflicts immediately. However trying to change a decisions taken in the past relative to a conflict already solved, and which does not belongs to the last merge, leads to an unavoidable loss of information on later decisions because it is necessary to revert the system at a point before the decision we want to change was taken.

The solution here proposed allows to store every uncertainty occurred during development process, in order to make it possible to solve them in a later time and indipendently from the others.

### Implementation

The implementation presented is based on EMF Compare as the tool to identify conflicts, in particular the three-way merge is considered.
The output of EMF Compare is a comparison model that complies with an Ecore metamodel (compare.ecore), from which information on every difference found will be extracted. These information need to be saved as another model that contains uncertainties and complies with a metamodel called Umodel, as Uncertainty model.
The Umodel is built starting from the metamodel of the system under consideration and adding for each metaclass another corresponding metaclass named with the same name but with the prefix ‘u’.
Every ‘uMetaclass’ will contain references to the left and right source metaclasses involved in the conflict.

The aim is to have an ATL transformation that gets every difference from the comparison model and traslate them to uncertanty classes of the Umodel. 
In the following image there is a comparison between 'Families' models on the left generated by EMF Compare, that contains two conflicts, one regarding an attribute change of the son John and the other on the new added member. Each od these conflicts have been transformed to 'uMember' metaclasses complying with UFamily metamodel.

![](https://github.com/stefanodifrancesco/uncertainty/blob/master/images/transformation.png)

The example just showed is available at [Use Cases - families - three-way_1](https://github.com/stefanodifrancesco/uncertainty/tree/master/it.univaq.disim.UseCases/families/three-way_1)
The ATL project [compare2UFamily](https://github.com/stefanodifrancesco/uncertainty/tree/master/it.univaq.disim.compare2UFamily
) provides ad hoc transformation for the 'Families' metamodel.

Regarding Higher-Order Transformation the project [HOTgenerator](https://github.com/stefanodifrancesco/uncertainty/tree/master/it.univaq.disim.HOTgenerator) allows to take any source metamodel as input to an Acceleo module and generates the ATL code for transforming a compare.ecore model to the corresponding uncertainty metamodel of the source metamodel.

DISCLAIMER
==========

- For every transformation, two different transformations are available and will be generated by the HOT generator, in order to distinguish the behaviour with pseudo conflicts.
- No transformation is able to translate towards the Umodel any *non containment* references with upper bound equal to 1, e.g. the *relatives* reference of Member metaclass of Families.ecore
- The HOTgenerator can generate ATL transformations with support to sub-packages in the form MM!"rootPackage::subPackage::metaclass", but they don't work, maybe missing something on ATL configuration side.

### Instructions

#### Requirements
Eclipse environment capable of executing the following plugins:
  - EMF Compare
  - ATL
  - Acceleo
  
  #### Clone 
  Github repository: https://github.com/stefanodifrancesco/uncertainty.git
  
  The project  [Use Cases](https://github.com/stefanodifrancesco/uncertainty/tree/master/it.univaq.disim.UseCases) provides some examples of three-way merges for each source metamodel. Each it.univaq.disim.uncertainty.* projects contains a corresponding uncertainty metamodel. **It is necessary to install the relative editor plugins in the Eclipse environment in order to execute successfully the EMF comparisons and transformations**.
  
  For the transformation execution create a new *ATL launch configuration* giving as input the Umodel.ecore as metamodel and a comparison model in XMI format complying with compare.ecore.
  
  For the Higher-Order Transformations generation create a new *Acceleo launch configuration* giving as input one the source metamodels contained in [HOTgenerator.source metamodels](https://github.com/stefanodifrancesco/uncertainty/tree/master/it.univaq.disim.HOTgenerator/source%20metamodels) 
  
  The ATL project [HighOrderTrasformations](https://github.com/stefanodifrancesco/uncertainty/tree/master/it.univaq.disim.HighOrderTranformations) contains all the generated HOTs.
