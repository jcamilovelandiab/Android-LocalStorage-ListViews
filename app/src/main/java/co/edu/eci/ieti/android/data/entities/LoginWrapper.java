package co.edu.eci.ieti.android.data.entities;

/**
 * @author Santiago Carrillo
 * 4/23/19.
 */
public class LoginWrapper{

    final String email;
    final String password;

    public LoginWrapper( String email, String password )
    {
        this.email = email;
        this.password = password;
    }
}
