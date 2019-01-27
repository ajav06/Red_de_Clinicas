package vista.Medico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import com.sun.corba.se.impl.encoding.CodeSetConversion.BTCConverter;

import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;

public class VentanaListaMedicos extends javax.swing.JFrame{

	private JTextField txtCedula_Nombre;
	private JTable table_Medicos;
	private JButton btnConsultar;
	private JButton btnRegistrarNvo;
	private JButton btnBuscar;
	private JButton btnSalir;
	private JComboBox comboBox_Especialidad;

	public VentanaListaMedicos() {
		super();
		setTitle("Listado de Médicos");
		initialize();
		setSize(585,579);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("Listado de Médicos");
		setAutoRequestFocus(false);
		setBounds(100, 100, 585, 579);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollPane scrollPane = new JScrollPane();
		
		btnConsultar = new JButton("Consultar");
		
		btnRegistrarNvo = new JButton("Registrar Nuevo");
		
		JLabel lblMdicosDeLa = new JLabel("Médicos de la Red");
		lblMdicosDeLa.setForeground(Color.BLUE);
		lblMdicosDeLa.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 25));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Buscar m\u00E9dicos", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		
		btnSalir = new JButton("Salir");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(lblMdicosDeLa)
							.addGap(138))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnConsultar, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnRegistrarNvo)
							.addPreferredGap(ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
							.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE))
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblMdicosDeLa)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnSalir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnConsultar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnRegistrarNvo, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		
		txtCedula_Nombre = new JTextField();
		txtCedula_Nombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtCedula_Nombre.setText("");
			}
		});
		txtCedula_Nombre.setText("Introduzca cédula de identidad o nombre");
		txtCedula_Nombre.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		
		JLabel lblFiltrarPorEspecialidad = new JLabel("Filtrar por Especialidad:");
		
		JComboBox comboBox_Especialidad = new JComboBox();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(txtCedula_Nombre, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(lblFiltrarPorEspecialidad)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox_Especialidad, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtCedula_Nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBuscar))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFiltrarPorEspecialidad)
						.addComponent(comboBox_Especialidad, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		table_Medicos = new JTable();
		table_Medicos.setFillsViewportHeight(true);
		table_Medicos.setRowSelectionAllowed(false);
		table_Medicos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00E9dula", "Nombre", "Especialidad"
			}
		));
		scrollPane.setViewportView(table_Medicos);
		getContentPane().setLayout(groupLayout);
	}
	
	public void addListener(ActionListener actionListener) {
		btnBuscar.addActionListener(actionListener);
		btnRegistrarNvo.addActionListener(actionListener);
		btnConsultar.addActionListener(actionListener);
		btnSalir.addActionListener(actionListener);
		comboBox_Especialidad.addActionListener(actionListener);
	}
	
	public void setResultados(AbstractTableModel abstractTableModel) {
		table_Medicos.setModel(abstractTableModel);
	}
	
	public JTable getTable_Medicos() {
		return table_Medicos;
	}

	public String getCedula() {
		return txtCedula_Nombre.getText();
	}
	
	public void salir() {
		this.setVisible(false);
		this.dispose();
	}
	
	public void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje);
	};

}
