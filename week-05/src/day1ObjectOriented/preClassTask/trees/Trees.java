package day1ObjectOriented.preClassTask.trees;

public class Trees {

    String treeType;
    String leafColor;
    int treeAge;
    String treeSex;

    public Trees() {

    }

    public Trees(String treeType, int treeAge, String leafColor, String treeSex) {
        this.treeType = treeType;
        this.leafColor = leafColor;
        this.treeAge = treeAge;
        this.treeSex = treeSex;
    }

    void printTreeType() {
        System.out.println(treeType + " " + treeAge + " " + leafColor + " " + treeSex);
    }

}


