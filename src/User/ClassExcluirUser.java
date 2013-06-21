package User;

import Util.AcessoBD;

public class ClassExcluirUser {

    AcessoBD bd;
    private int id;

    public ClassExcluirUser() {
        bd = new AcessoBD();
    }

    public void setId(int i){
        id = i;
    }

    public void excluirUser(){
        String sql = "DELETE FROM usuario WHERE id = '"+id+"'";
        bd.updateBase(sql);
    }

}
