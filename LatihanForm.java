import java.awt.*;
import java.awt.event.*;
import javax.swing.ButtonGroup;

public class LatihanForm {
	
	public static void main(String[] args) {
		Frame fr = new Frame("Input Mahasiswa");
		fr.setSize(200,200);
		fr.setVisible(true);
		fr.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0); 
			}
		});
		
		Panel j = new Panel();
		Panel p = new Panel();
		Panel p1 = new Panel();

		Label judul = new Label("ENTRY DATA");
		Label nim = new Label("NIM");
		TextField nim1 = new TextField(20);
		Label nama = new Label("Nama");
		TextField nama1 = new TextField(20);
		Label hobi = new Label("Hobi");
		Label a = new Label("");
		Label jk = new Label("Jenis Kelamin");
		Label b = new Label("");
		
/*		public static String jkLaki = "Laki-laki";
		private static String jkPerempuan = "Perempuan";
		
        RadioButton LakiButton = new RadioButton();
        LakiButton.setMnemonic(KeyEvent.VK_L);
        LakiButton.setActionCommand();
/*
        RadioButton PerempuanButton = new RadioButton(jkPerempuan);
        PerempuanButton.setMnemonic(KeyEvent.VK_P);
        PerempuanButton.setActionCommand(jkPerempuan);

		ButtonGroup group = new ButtonGroup();
        group.add(LakiButton);
        group.add(PerempuanButton);		
*/		
		j.add(judul);
		p.setLayout(new GridLayout(5,5));
		p.add(nim);
		p.add(nim1);
		p.add(nama);
		p.add(nama1);
		p.add(hobi);
		p.add(a);
		p.add(jk);
		p.add(b);
/*		p.add(PerempuanButton);*/
		
		Button simpan=new Button("Simpan");
		Button batal=new Button("Batal");
		p.add(simpan);
		p.add(batal);
	
		p1.add(p);
		fr.add(j,BorderLayout.NORTH);
		fr.add(p1,BorderLayout.CENTER);
	}
}