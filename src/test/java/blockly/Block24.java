package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.junit.Test;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Block24 {

public static final int TIMEOUT = 300;

/**
 */
// Block
@Test
public  void Execute() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
   return Var.VAR_NULL;
   }
 }.call();
}

}

