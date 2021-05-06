public class Admin extends User {

    private String admin_name;
    private String email;

    Admin(String user_id) {
        super(user_id);
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setAdmin_name(String admin_name){
        this.admin_name = admin_name;
    }

    public String getAdmin_name(){
        return this.admin_name;
    }

    public void update_catalog(){
        //relation with other entity is required
    }
}
