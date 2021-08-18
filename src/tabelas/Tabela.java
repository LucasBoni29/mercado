package tabelas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
//DECLARANDO VARIAVEIS
public class Tabela extends JPanel {
	private JPanel pnPrincipal, pnTable;
	private JButton btFinalizar, btRemover, btAdicionar,btProduto, btPrecoUnitario,btQtde, btProduto1, btProduto2, btProduto3, btProduto4, btProduto5,btAdmin;
	private JScrollPane scrollTable;
	private JTable table; // DECLARACAO DE TABELA
	private JLabel lbTotal,background;
	private JTextField tfTotal, tfProduto, tfPrecoUnitario, tfQtde,tfSenha;
	private ImageIcon img0,img1, img2, img3, img4, img5, img6 ,img7;
	private JRadioButton ftcredito, ftdebito, ftdinheiro;
	private ButtonGroup btGroup1;
	static ImageIcon icon = new ImageIcon(
			"C:\\Users\\Raio1\\Desktop\\CEAP\\Aulas Java\\tabelas\\src\\imagem\\carrin.png");
	DecimalFormat df = new DecimalFormat("#,###.00"); // CLASSE PARA FORMATAR UM CAMPO DE UMA TABELA;

	public Tabela() {
		inicializarComponentes();
		definirEventos();
	}

	private void inicializarComponentes() {
		setLayout(null);//IMAGENS
		img0 = new ImageIcon("C:\\Users\\Raio1\\Desktop\\CEAP\\Aulas Java\\tabelas\\src\\imagem\\fundo.jpg");
		img1 = new ImageIcon("C:\\Users\\Raio1\\Desktop\\CEAP\\Aulas Java\\tabelas\\src\\imagem\\cake.png");
		img2 = new ImageIcon("C:\\Users\\Raio1\\Desktop\\CEAP\\Aulas Java\\tabelas\\src\\imagem\\caramelo.png");
		img3 = new ImageIcon("C:\\Users\\Raio1\\Desktop\\CEAP\\Aulas Java\\tabelas\\src\\imagem\\melancia.png");
		img4 = new ImageIcon("C:\\Users\\Raio1\\Desktop\\CEAP\\Aulas Java\\tabelas\\src\\imagem\\framboesa.png");
		img5 = new ImageIcon("C:\\Users\\Raio1\\Desktop\\CEAP\\Aulas Java\\tabelas\\src\\imagem\\caketop.png");
		img6 = new ImageIcon("C:\\Users\\Raio1\\Desktop\\CEAP\\Aulas Java\\tabelas\\src\\imagem\\adminlock.png");
		img7 = new ImageIcon("C:\\Users\\Raio1\\Desktop\\CEAP\\Aulas Java\\tabelas\\src\\imagem\\adminopen.png");
		
		//BOTOES
		btProduto1 = new JButton(img1);
		btProduto2 = new JButton(img2);
		btProduto3 = new JButton(img3);
		btProduto4 = new JButton(img4);
		btProduto5 = new JButton(img5);
		btAdmin = new JButton(img6);
		
		//BOUNDS DOS BOTOES
		btProduto1.setBounds(30, 20, 80, 80);
		btProduto2.setBounds(120, 20, 80, 80);
		btProduto3.setBounds(210, 20, 80, 80);
		btProduto4.setBounds(300, 20, 80, 80);
		btProduto5.setBounds(390, 20, 80, 80);
		btAdmin.setBounds(750, 410, 30, 30);
		
		//ESTILO BOTOES
		btProduto1.setBackground(new Color (255,140,0));
		btProduto2.setBackground(new Color (255,140,0));
		btProduto3.setBackground(new Color (255,140,0));
		btProduto4.setBackground(new Color (255,140,0));
		btProduto5.setBackground(new Color (255,140,0));
		btAdmin.setBackground(Color.black);
		
		
		ftcredito = new JRadioButton("Cartão de Crédito!");
		ftdebito = new JRadioButton("Cartão de Débito");
		ftdinheiro = new JRadioButton("Dinheiro Vivo!");
		btGroup1 = new ButtonGroup();
		btGroup1.add(ftcredito);
		btGroup1.add(ftdebito);
		btGroup1.add(ftdinheiro);
		btProduto = new JButton("Produto");
		btQtde = new JButton("Quantidade");
		btPrecoUnitario = new JButton("Preço Unitário");
		lbTotal = new JLabel("Total de Pedidos");
		lbTotal.setForeground(Color.white);
		lbTotal.setFont(new Font("Comic sans ms", Font.BOLD, 12));
		tfProduto = new JTextField();
		tfPrecoUnitario = new JTextField();
		tfQtde = new JTextField();
		tfSenha = new JTextField();
		tfSenha.setToolTipText("Senha Admin");
		tfTotal = new JTextField();
		tfTotal.setEnabled(false);// TEXTFIELD EDITAVEL OU NAO
		tfTotal.setHorizontalAlignment(JTextField.CENTER);// ALINHAMENTO DO TEXTO NO TEXTFIELD (ESQUERDA, DIREITA,
		// CENTRO)
		btAdicionar = new JButton("Adicionar");
		btAdicionar.setToolTipText("Adiciona um item ao pedido");
		btRemover = new JButton("Remover");
		btRemover.setToolTipText("Remove os itens selecionados");
		btFinalizar = new JButton("Finalizar Compra");
		btFinalizar.setFont(new Font("Comic sans ms", Font.BOLD, 14));
		btProduto.setFont(new Font("Comic sans ms", Font.BOLD, 12));
		btQtde.setFont(new Font("Comic sans ms", Font.BOLD, 11));
		btPrecoUnitario.setFont(new Font("Comic sans ms", Font.BOLD, 12));
		ftcredito.setBounds(630,240,150,25);
		ftdebito.setBounds(630,180,150,25);
		ftdinheiro.setBounds(630,310,150,25);
		btProduto.setBounds(500, 20, 100, 25);
		tfProduto.setBounds(610, 20, 150, 25);
		btPrecoUnitario.setBounds(500, 55, 120, 25);
		tfPrecoUnitario.setBounds(630, 55, 80, 25);
		btQtde.setBounds(500, 90, 100, 25);
		tfQtde.setBounds(610, 90, 50, 25);
		tfSenha.setBounds(670, 415, 70, 20);
		lbTotal.setBounds(30, 380, 100, 25);
		tfTotal.setBounds(30, 405, 105, 25);
		btAdicionar.setBounds(525, 130, 100, 22);
		btRemover.setBounds(650, 130, 100, 22);
		btFinalizar.setBounds(250,380,150,40);

		//ESTILO BT E TF
		btProduto.setBackground(Color.orange);
		btPrecoUnitario.setBackground(Color.orange);
		btQtde.setBackground(Color.orange);
		btAdicionar.setBackground(Color.orange);
		btRemover.setBackground(Color.orange);
		btFinalizar.setBackground(new Color (255,140,0));
		tfSenha.setBackground(Color.orange);
		tfTotal.setBackground(Color.black);
		//ADMIN
		btProduto.setEnabled(false);
		btPrecoUnitario.setEnabled(false);
		btQtde.setEnabled(false);
		btFinalizar.setFocusable(false);
		tfProduto.setEnabled(false);
		tfQtde.setEnabled(false);
		tfPrecoUnitario.setEnabled(false);
		ftcredito.setFocusable(false);
		ftdebito.setFocusable(false);
		ftdinheiro.setFocusable(false);
		
		//ADD AO PN PRINCIPAL
		pnPrincipal = new JPanel();
		pnPrincipal.setLayout(null);
		pnPrincipal.setBounds(0, 0, 800, 500);
		pnPrincipal.add(btProduto);
		pnPrincipal.add(tfProduto);
		pnPrincipal.add(btQtde);
		pnPrincipal.add(tfQtde);
		pnPrincipal.add(btPrecoUnitario);
		pnPrincipal.add(tfPrecoUnitario);
		pnPrincipal.add(lbTotal);
		pnPrincipal.add(tfTotal);
		pnPrincipal.add(ftcredito);
		pnPrincipal.add(ftdebito);
		pnPrincipal.add(ftdinheiro);
		pnTable = new JPanel(new BorderLayout());
		pnTable.setBorder(new TitledBorder("Itens do Pedido"));// LINHAS 64 E 65 DEFINEM A BORDA DO PAINEL , COM O NOME
		// DELE (NESSE CASO ITENS DO PEDIDO)
		scrollTable = new JScrollPane();
		df.setMinimumFractionDigits(2);// MINIMO DE NUMEROS DEPOIS DA VIRGULA
		df.setMaximumFractionDigits(2);// MAXIMO DE NÚMEROS DEPOIS DA VIRGULA
		pnPrincipal.add(btProduto1);
		pnPrincipal.add(btProduto2);
		pnPrincipal.add(btProduto3);
		pnPrincipal.add(btProduto4);
		pnPrincipal.add(btProduto5);
		pnPrincipal.add(btAdicionar);
		pnPrincipal.add(btRemover);
		pnPrincipal.add(btFinalizar);
		pnPrincipal.add(btAdmin);
		pnPrincipal.add(tfSenha);
		pnTable.setBackground(Color.orange);

		DefaultTableModel tableModel = new DefaultTableModel(new String[] { "Produto", "Qtd", "Preço Un.", "Total" },0) { // CRIA O LAYOUT DA TABELA , OS ITENS DO VETOR SÃO OS NOMES DA COLUNA, O 0
			// INDICA QUE A TABELA SAÍRA SEM NENHUMA LINHA
			public boolean isCellEditable(int row, int col) { // MÉTODO PARA DIZER SE A CELULA SERÁ EDITAVEL OU NÃO
				if (col == 3 || col == 2 || col == 1) {
					return false;
				}
				return true;
			}
		};
		table = new JTable(tableModel);// INSTANCIA A TABELA E ADICIONA O MODELO DE TABELA CRIADO ANTERIOMENTE A ELA
		DefaultTableCellRenderer alinhaDireita = new DefaultTableCellRenderer();
		alinhaDireita.setHorizontalAlignment(SwingConstants.RIGHT);// A VARIÁVEL ALINHADIREITA ALINHA O CONTEUDO DA
		// TABELA A DIREITA
		table.getColumnModel().getColumn(0).setPreferredWidth(150); // DEFINE O TAMANHO DA COLUNA
		table.getColumnModel().getColumn(0).setResizable(true);// DEFINE SE A COLUNA É EDITAVEL OU NÃO ;
		table.getColumnModel().getColumn(1).setPreferredWidth(50);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setCellRenderer(alinhaDireita);// ALINHA O CONTEÚDO DA CELULA A DIREITA;
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setCellRenderer(alinhaDireita);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setCellRenderer(alinhaDireita);
		table.getTableHeader().setReorderingAllowed(false);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);// LINHAS 97 E 98 DEFINE QUE AS COLUNAS NÃO PODEM SER
		// REORGANIZADAS COM ARRASTE E SOLTE
		scrollTable.setViewportView(table);
		pnTable.add(scrollTable);
		pnTable.setBounds(20, 130, 470, 230);
		pnPrincipal.add(pnTable);
		background = new JLabel(img0);
		background.setBounds(0,0,800,450);
		pnPrincipal.add(background);
		add(pnPrincipal);
	}

	
	private void definirEventos(){
		btProduto1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tfProduto.setText("Cake");
				tfQtde.setText("1");
				tfPrecoUnitario.setText("5.00");
			}
		});
		btProduto2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tfProduto.setText("Calda");
				tfQtde.setText("1");
				tfPrecoUnitario.setText("3.00");
			}
		});
		btProduto3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tfProduto.setText("Melancia");
				tfQtde.setText("1");
				tfPrecoUnitario.setText("15.00");
			}
		});
		btProduto4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tfProduto.setText("Framboesa");
				tfQtde.setText("1");
				tfPrecoUnitario.setText("2.00");
			}
		});
		btProduto5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tfProduto.setText("CakeTopssimo");
				tfQtde.setText("1");
				tfPrecoUnitario.setText("30.00");
			}
		});
		
		btAdicionar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(tfProduto.getText().equals("") || tfQtde.getText().equals("") || tfPrecoUnitario.getText().equals("") ){
					JOptionPane.showMessageDialog(pnTable, "Preencha todos os campos");
					return;
				}
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				dtm.addRow(new Object[] {tfProduto.getText(), tfQtde.getText(),tfPrecoUnitario.getText(),""+ df.format(Integer.parseInt
						(tfQtde.getText()) *Double.parseDouble(tfPrecoUnitario.getText()))});// linhas 114 a 116 adicionam uma linha na tabela 
				limparCampos();
				calcularTotal();
			}

		});
		btRemover.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int[] linhas = table.getSelectedRows();
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				for(int i = (linhas.length -1 ); i>=0; --i){ //esse for percorre o vetor de linhas , verifica qual  linha é selecionada e exclui
					dtm.removeRow(linhas[i]);
				}
				calcularTotal();
			}
		});

	
	btFinalizar.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
			for(int i=0;i<table.getRowCount();i++) {
				String selecao = "Nota Fiscal: \n";
				String pagamento;
				if(ftcredito.isSelected()){
					pagamento = "Crédito";
					selecao += "\nForma de Pagamento: "+pagamento;
				}
				if(ftdinheiro.isSelected()) {
					pagamento = "Dinheiro Vivo!";
					selecao += "\nForma de Pagamento: "+pagamento;
				}
				if(ftdebito.isSelected()) {
					pagamento = "Débito";
					selecao += "\nForma de Pagamento: "+pagamento;
				}
				selecao +="\nProduto: "+table.getValueAt(i, 0);
				selecao +="\nQtd: "+table.getValueAt(i, 1);
				selecao +="\nPreco: "+table.getValueAt(i, 2);
				selecao +="\ntotal: "+table.getValueAt(i, 3);
				JOptionPane.showMessageDialog(null,selecao);
			}
			JOptionPane.showMessageDialog(null,tfTotal);
		}

	});
	
	btAdmin.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
			if(tfSenha.getText().equals("123")){
				tfProduto.setEnabled(true);
				tfQtde.setEnabled(true);
				tfPrecoUnitario.setEnabled(true);
				btAdmin.setIcon(img7);
				JOptionPane.showMessageDialog(null,"Bem vindo Admin! =) ");
	        }else{
	        	JOptionPane.showMessageDialog(null,"senha inválida! =( ");
					
	        	}
			}
		});
	}
				
	private void calcularTotal(){
		double total = 0;
		for(int linha = 0; linha<table.getRowCount(); linha++){// for para tirar os pontoos, e virguglas do numero para calcular total
			String valor = " "+table.getValueAt(linha,3);
			valor = valor.replace(".","");
			valor = valor.replace(",",".");
			total += Double.parseDouble(valor);
		}
		tfTotal.setText(""+df.format(total));
	}

	private void limparCampos(){
		tfProduto.setText("");
		tfQtde.setText("");
		tfPrecoUnitario.setText("");
		tfProduto.requestFocus();
	}

	public static void main(String args[]) {
		JFrame frame = new JFrame("SuperMarket");
		frame.setIconImage(icon.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Tabela());
		frame.setBounds(100, 100, 800, 485);
		frame.setVisible(true);
	}
}
