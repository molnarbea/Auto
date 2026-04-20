package main;

import java.util.Objects;

public class Auto {
    
    private boolean uzemanyag;
    private boolean inditva;
    private String megy;

    public Auto() {
        this(true, true,"");
    }

    
    
    public Auto(boolean uzemanyag, boolean inditva, String megy) {
        this.uzemanyag = uzemanyag;
        this.inditva = inditva;
        this.megy = megy;
    }

    

    public boolean isUzemanyag() {
        return uzemanyag;
    }

    public boolean isInditva() {
        return inditva;
    }

    public String getMegy() {
        return megy;
    }
    

    public void setInditva(boolean inditva) {
        this.inditva = inditva;
    }
    
    public void megy(){
        System.out.printf("Üzemanyag: %b\n",this.uzemanyag);
        System.out.printf("Beindítva: %b\n",this.inditva);
        if (this.inditva == true && this.uzemanyag == true){
            this.uzemanyag = false;
            this.megy += "-";
            System.out.printf("\nMegy: %s@\n",this.megy);
        }else{
            System.out.printf("\nMegy: %s@\n",this.megy);
        }
    }
    
    public void tankol(){
        if (this.inditva != true && this.uzemanyag != true){
            this.uzemanyag = true;
            System.out.printf("Tankol: %b\n",true);
        }else{
            System.out.printf("Tankol: %b\n",false);
        }
        System.out.println("***************\n");
    }

    @Override
    public String toString() {
        return "Auto{" + "uzemanyag=" + uzemanyag + ", inditva=" + inditva + ", megy=" + megy + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.uzemanyag ? 1 : 0);
        hash = 83 * hash + (this.inditva ? 1 : 0);
        hash = 83 * hash + Objects.hashCode(this.megy);
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
        if (this.inditva != other.inditva) {
            return false;
        }
        return Objects.equals(this.megy, other.megy);
    }

    
    
    
}
