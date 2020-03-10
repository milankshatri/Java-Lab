# GridBagLayout

Java GridBagLayout class is used to align the components horizontally, vertically or along the baseline.


Each GridBagLayout object maintains a dynamic, rectangular grud of cells. Each component occupies one or more cells known as its display area. Each component associates an instance of GridBagConstraints. With the help of constraints object we arrange component's display area on the grid. The GridBagLayout manages each component's minimum and preferred sizes in order to determine component's size.

### Fields 

|Modifier and Type|Field|Description|
|---|---|---|
|double[]|columnWeights|It is used to hold the overrides to the column weights.|
int[]|columnWidths|It is used to hold the overrides to the column minimum width.|
protected Hashtable<Component,GridBagConstraints>|comptable|It is used to maintains the association between a component and its gridbag constraints.|
protected GridBagConstraints|defaultConstraints|It is used to hold a gridbag constraints instance containing the default values.|
protected GridBagLayoutInfo|layoutInfo|It is used to hold the layout information for the gridbag.|
protected static int|MAXGRIDSIZE|No longer in use just for backward compatibility.|
protected static int|MINSIZE|It is smallest grid that can be laid out by the grid bag layout.|
protected static int|PREFERREDSIZE|It is preferred grid size that can be laid out by the grid bag layout.|
int[]|rowHeights|It is used to hold the overrides to the row minimum heights.|
double[]|rowWeights|It is used to hold the overrides to the row weights.|

### Useful Methods

Modifier and Type|Method|Description
---|---|---
void|addLayoutComponent(Component comp, Object constraints)|It adds specified component to the layout, using the specified constraints object.
void|addLayoutComponent(String name, Component comp)|It has no effect, since this layout manager does not use a per-component string.
protected void|adjustForGravity(GridBagConstraints constraints, Rectangle r)|It adjusts the x, y, width, and height fields to the correct values depending on the constraint geometry and pads.
protected void|AdjustForGravity(GridBagConstraints constraints, Rectangle r)|This method is for backwards compatibility only
protected void|arrangeGrid(Container parent)|Lays out the grid.
protected void|ArrangeGrid(Container parent)|This method is obsolete and supplied for backwards compatibility
GridBagConstraints|getConstraints(Component comp)|It is for getting the constraints for the specified component.
float|getLayoutAlignmentX(Container parent)|It returns the alignment along the x axis.
float|getLayoutAlignmentY(Container parent)|It returns the alignment along the y axis.
int[][]|getLayoutDimensions()|It determines column widths and row heights for the layout grid.
protected GridBagLayoutInfo|getLayoutInfo(Container parent, int sizeflag)|This method is obsolete and supplied for backwards compatibility.
protected GridBagLayoutInfo|GetLayoutInfo(Container parent, int sizeflag)|This method is obsolete and supplied for backwards compatibility.
Point|getLayoutOrigin()|It determines the origin of the layout area, in the graphics coordinate space of the target container.
double[][]|getLayoutWeights()|It determines the weights of the layout grid's columns and rows.
protected Dimension|getMinSize(Container parent, GridBagLayoutInfo info)|It figures out the minimum size of the master based on the information from getLayoutInfo.
protected Dimension|GetMinSize(Container parent, GridBagLayoutInfo info)|This method is obsolete and supplied for backwards compatibility only
