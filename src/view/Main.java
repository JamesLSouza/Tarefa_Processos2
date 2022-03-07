
package view;

import javax.swing.JOptionPane;

import controller.KillController;

public class Main {

		public static void main(String[] args) {
			
		    KillController cont = new KillController();
            cont.os();
		
        int mtprocess = 0;
		
		do{
			mtprocess = Integer.parseInt(JOptionPane.showInputDialog(null, ("Deseja matar o processo por: \n 1 - Exibir \n 2 - Matar processo \n 3 - Finalizar")));
		
		switch (mtprocess) {
		case 1: 
			String process = "TASKLIST /FO TABLE";
		    cont.readProcess(process);
			   
			break;
		case 2: 
			String process1 = "cmd.exe";
			cont.killProcess(process1);
			System.out.println("\n O processo foi morto!!");
			break;
			
		case 3: 
			System.out.println("\n Execução finalizada!!");
			break;
		}
		}while ((mtprocess != 2) && (mtprocess != 3));
		
    }
}