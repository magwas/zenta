package org.rulez.magwas.zenta.editor.propertysections;

import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;

public class ModelsViewer extends TableViewer {
    private final class ModelsViewSorter extends ViewerSorter {
		@Override
		public int category(Object element) {
		    if(element == ImageManagerDialog.OPEN) {
		        return 1;
		    }
		    return 0;
		}
	}

	public ModelsViewer(Composite parent) {
        super(parent, SWT.FULL_SELECTION);
        setColumns();
        setContentProvider(new ModelsViewerContentProvider());
        setLabelProvider(new ModelsViewerLabelProvider());
        ViewerSorter viewerSorter = new ModelsViewSorter();
		setSorter(viewerSorter);
    }
    
    protected void setColumns() {
        Table table = getTable();
        table.setHeaderVisible(false);
        
        // Use layout from parent container
        TableColumnLayout layout = (TableColumnLayout)getControl().getParent().getLayout();
        TableViewerColumn column = new TableViewerColumn(this, SWT.NONE);
        layout.setColumnData(column.getColumn(), new ColumnWeightData(100, false));
    }
}