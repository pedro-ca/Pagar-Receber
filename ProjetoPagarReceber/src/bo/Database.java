
package bo;


public class Database {     //capacidade: 10 logins e 10 senhas
    private String login[] = new String[10];
    private String password[] = new String[10];
    private int i,n;      //n = numero de termos no array
    
    public Database() {
       this.n = 1;
       this.login[0] = "admin";          //default user 
       this.password[0] = "admin";      //default password 
    }
   
    //precisa de cosntrutor com paramentros
    
     public boolean check(String log, String pass) {
         for(i=0; i<n; i++){
            if( log.equals(this.login[i]) && pass.equals(this.password[i]) ){        //pass == password[i] && log == login[i]
                return true;
            }
        }    
        return false;
    }
     
     public void createAccount(String log, String pass) {
         if(this.n < 10) {
             this.login[n] = log;
             this.password[n] = pass;
             this.n++;
         }
     }
     
}

//todo:
//registrar a conta com um login, senha e confirmacao de senha
//      *se senha e confirmacao de senha está incorreto, fechar o processo
//      *a nova conta precisar ser gravada na database