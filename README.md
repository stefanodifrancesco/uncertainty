# Metamodel conflicts management

Taking into consideration any versioning system for collaborative modeling, a common problem to face is the conflicts resolution as part of merge operations. Most of the solutions to this problem propose to resolve conflicts immediately. However trying to change a decisions taken in the past relative to a conflict already solved, and which does not belongs to the last merge, leads to an unavoidable loss of information on later decisions because it is necessary to revert the system at a point before the decision we want to change was taken.

The solution here proposed allows to store every uncertainty occurred during development process, in order to make it possible to solve them in a later time and indipendently from the others.

The implementation presented is based on EMF Compare as the tool to identify conflicts, in particular the three-way merge is considered (some examples are contained in the project ‘it.univaq.disim.UseCases’).
The output of EMF Compare is a comparison model that complies with an Ecore metamodel (compare.ecore), from which information on every difference found will be extracted. These information need to be saved as another model that complies with a metamodel that contains uncertainties, it is called Umodel, as Uncertainty model.
The Umodel is built starting from the metamodel of the system under consideration and adding for each metaclass another corresponding metaclass named with the same name but with the prefix ‘u’.
Every ‘uMetaclass’ will contain references to the left and right source metaclasses involved in the conflict.

The aim of the ATL transformation is to get every difference from the comparison model and traslate them to uncertanty classes of the Umodel.
