package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Block123 {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Block123
public static Var Execute() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {

    item = Var.VAR_NULL;
    return Var.VAR_NULL;
   }
 }.call();
}

}

