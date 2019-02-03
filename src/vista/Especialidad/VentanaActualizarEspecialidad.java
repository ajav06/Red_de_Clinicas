package vista.Especialidad;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class VentanaActualizarEspecialidad extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Cod;
	private JTextField textField_Nom;
	private JTextArea textArea_Des;
	private JButton btnAceptar;
	private JButton btnCancelar;

	
public VentanaActualizarEspecialidad() {
	super();
	initGUI();
		
	}
	
	
	
	
	private void initGUI() {
		
				try {setTitle("Actualizar Especialidad");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 540, 400);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				
				JLabel lblActualizarE = new JLabel("Actualizar Especialidad");
				lblActualizarE.setForeground(Color.BLUE);
				lblActualizarE.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
				
				JPanel panel = new JPanel();
				panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Datos Especialidad", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				
				btnCancelar = new JButton("No");
				btnCancelar.setBackground(Color.RED);
				
				btnAceptar = new JButton("Si");
				btnAceptar.setBackground(Color.GREEN);
				
				JLabel lblSeguro = new JLabel("\u00BF Seguro que desea Actualizar?");
				lblSeguro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
				GroupLayout gl_contentPane = new GroupLayout(contentPane);
				gl_contentPane.setHorizontalGroup(
					gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(115)
									.addComponent(lblActualizarE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(57)
									.addComponent(panel, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(45, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap(76, Short.MAX_VALUE)
							.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
							.addGap(66))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap(217, Short.MAX_VALUE)
							.addComponent(lblSeguro)
							.addGap(147))
				);
				gl_contentPane.setVerticalGroup(
					gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblActualizarE)
							.addGap(11)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
							.addComponent(lblSeguro)
							.addGap(26)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
				);
				
				JLabel lblCodigo = new JLabel("Codigo:");
				
				textField_Cod = new JTextField();
				textField_Cod.setColumns(10);
				
				JLabel lblNombre = new JLabel("Nombre:");
				
				textField_Nom = new JTextField();
				textField_Nom.setColumns(10);
				
				JLabel lblDescripcion = new JLabel("Descripcion:");
				
				textArea_Des = new JTextArea();
				GroupLayout gl_panel = new GroupLayout(panel);
				gl_panel.setHorizontalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblDescripcion)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(lblCodigo)
									.addComponent(lblNombre)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_Nom, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_Cod, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
								.addComponent(textArea_Des, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(53, Short.MAX_VALUE))
				);
				gl_panel.setVerticalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCodigo)
								.addComponent(textField_Cod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNombre)
								.addComponent(textField_Nom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDescripcion)
								.addComponent(textArea_Des, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(73, Short.MAX_VALUE))
				);
				panel.setLayout(gl_panel);
				contentPane.setLayout(gl_contentPane);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		
	
	public void blanquearCampos() {
		textField_Cod.setText(null);
		textField_Nom.setText(null);
		textArea_Des.setText(null);
		
			
	}
	
	public void llenarCampos(String cod,String nom,String des) {
		textField_Cod.setText(cod);
		textField_Nom.setText(nom);
		textArea_Des.setText(des);	
		
		}
	
	public void addListener(ActionListener actionListener) {
		
		btnAceptar.addActionListener(actionListener);
		btnCancelar.addActionListener(actionListener);
		
	}
	
	public void setCodigo (String cod) {
		
		this.textField_Cod.setText(cod);
		
	}
	
	public void setNombre (String nom) {
		
		this.textField_Nom.setText(nom);
			
	}
	
	public void setDescripcion (String des) {
		
		this.textArea_Des.setText(des);
		
	}
	
	public String getCodigo() {
		
		return textField_Cod.getText();
		
		
	}
	public String getNombre() {
		
		return textField_Nom.getText();
		
	}
	
	public String getDescripcion() {
		
		return textArea_Des.getText();
		
	}
	
	public void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje);
	}
	
	
	
	
	
	
	
	
	
	// fin actualizar especialidad
}
