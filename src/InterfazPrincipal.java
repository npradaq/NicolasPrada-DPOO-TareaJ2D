import javax.swing.JFrame;

public class InterfazPrincipal extends JFrame{
    
    private PanelLienzo panelLienzo;

    public InterfazPrincipal(){

        panelLienzo = new PanelLienzo();
        add(panelLienzo);
        
        setTitle("InterfazPrincipal");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000,650);
        
        
        setVisible(true);


    }


    public static void main(String[] args) {
        new InterfazPrincipal();
    }
}
