import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTable;

public class SimpleTableTest extends JFrame{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SimpleTableTest() {

        Container pane = getContentPane();

        pane.setLayout(new BorderLayout());

        table tv = new table();

        table =new JTable(tv);

        table1 = new JTable(new javax.swing.table.DefaultTableModel(4, 5));

        pane.add(table,BorderLayout.CENTER);

        pane.add(table1,BorderLayout.SOUTH);

    }

    protected JTable table,table1;

    public static void main(String[] args){

        SimpleTableTest stt = new SimpleTableTest();

        stt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        stt.setSize(400, 200);

        stt.setVisible(true);

    }

}
