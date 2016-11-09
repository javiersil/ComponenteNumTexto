package Principal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
/**
 *
 * @author cosma_000
 */
public class CampoNumericoString extends JTextField {
    private int nDigitos;
    private int valor;
    private boolean f=true;
    private boolean d=false;
    public CampoNumericoString(){
        
		super();
                this.setText("");
		this.setColumns(nDigitos + 1);
		valor = 0;
                 this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tnKeyTyped(evt);
            }
        });
  
	}

	public void setNDigitos(int n){
		nDigitos = n;
		this.setColumns(nDigitos + 1);
	}

	public Object getValor(){
            if(d){
		if(this.getText().equals(""))
			valor = 0;
		else
			valor = Integer.parseInt(this.getText());
		return valor;
            }else return this.getText();
	}
        
public void setLetra(boolean f){
        this.d= !f;
 this.f=f;

}
public void setNumeros(boolean f){
    this.f=!f;
this.d=f;

}
        
       
	public void tnKeyTyped(KeyEvent e){
            char k = (Character) e.getKeyChar();
            if(f){
		  if(Character.isDigit(k) ||this.getText().length() == nDigitos)
                     e.consume();
		
                }else{
             
               if(!Character.isDigit(k) || this.getText().length() == nDigitos )                   
			 e.consume();
               }
	    
        
        
        }

        
        

   

        
    
}
