public class User {

    private String user_id;

    private String password;

    private Boolean login_status = false;

    User(String user_id){
        this.user_id = user_id;
    }

    public String verify_login(){
        if(login_status){
            return "sudah login";
        }
        return "belum login";
    }

    public String getUser_id(){
        return user_id;
    }

    public void setUser_id(String user_id){
        this.user_id = user_id;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    public void setLogin_status(boolean login_status){
        this.login_status = true;
    }

}
