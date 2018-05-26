import corbaBanque.Compte;
import corbaBanque.IBanqueRemote;
import corbaBanque.IBanqueRemoteHelper;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Created by mkaroune on 10/09/2017.
 */
public class ClientCorba {

    public static void main (String [] args){

        try {
            Context context = new InitialContext();
            // Look up and narrow the object
            Object reference = context.lookup("BANQUE");
            IBanqueRemote stub = IBanqueRemoteHelper.narrow((org.omg.CORBA.Object)reference);
            System.out.println(stub.conversion(50));
            Compte cp = stub.getCompte(2);
            System.out.println("Code : "+ cp.code );
            System.out.println("Solde : " + cp.solde);

            Compte[] comptes = stub.getComptes();
            for(Compte c : comptes){
                System.out.println(c.code + "--->" + c.solde);
            }
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
