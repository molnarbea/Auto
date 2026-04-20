package main;

public class Auto {
    
    private boolean uzemanyag;
    private boolean inditva;

    public Auto() {
        this(true, true);
    }
    
    public Auto(boolean uzemanyag, boolean inditva) {
        this.uzemanyag = uzemanyag;
        setInditva(inditva);
    }

    public boolean isUzemanyag() {
        return uzemanyag;
    }

    public boolean isInditva() {
        return inditva;
    }

    public void setInditva(boolean inditva) {
        this.inditva = inditva;
    }
    
    public void megy(){
        System.out.printf("Üzemanyag: %b\n",this.uzemanyag);
        System.out.printf("Beindítva: %b\n",this.inditva);
        if (this.inditva == true && this.uzemanyag == true){
            this.uzemanyag = false;
            System.out.printf("\nMegy: %b\n",true);
        }else{
            System.out.printf("\nMegy: %b\n",false);
        }
    }
    
    public void tankol(){
        System.out.printf("Üzemanyag: %b\n",this.uzemanyag);
        System.out.printf("Beindítva: %b\n",this.inditva);
        if (this.inditva != true && this.uzemanyag != true){
            this.uzemanyag = true;
            System.out.printf("\nTankol: %b\n",true);
        }else{
            System.out.printf("\nTankol: %b\n",false);
        }
        System.out.println("***************");
    }

    @Override
    public String toString() {
        return "Auto{" + "uzemanyag=" + uzemanyag + ", inditva=" + inditva + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (this.uzemanyag ? 1 : 0);
        hash = 83 * hash + (this.inditva ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Auto other = (Auto) obj;
        if (this.uzemanyag != other.uzemanyag) {
            return false;
        }
        return this.inditva == other.inditva;
    }
    
}
