package day1ObjectOriented;

public class Forest {

    public static void main(String[] args) {
        Trees oak = new Trees();
        Trees birch = new Trees();
        Trees cherry = new Trees();
        Trees elm = new Trees();
        Trees hickory = new Trees();

        hickory.treeType = "Hickory tree";
        hickory.treeAge = 25;
        hickory.leafColor = "yellowish-green";
        hickory.treeSex = "female";
        hickory.printTreeType();

        elm.treeType = "Elm tree";
        elm.treeAge = 40;
        elm.leafColor = "brown";
        elm.treeSex = "single sex";
        elm.printTreeType();

        cherry.treeType = "Japanese cherry tree";
        cherry.treeAge = 30;
        cherry.leafColor = "pink";
        cherry.treeSex = "male";
        cherry.printTreeType();

        birch.treeType = "Birch tree";
        birch.treeAge = 15;
        birch.leafColor = "yelow";
        birch.treeSex = "male";
        birch.printTreeType();

        oak.treeType = "Oak tree";
        oak.treeAge = 45;
        oak.leafColor = "green";
        oak.treeSex = "single sex tree";
        oak.printTreeType();

        Trees newTree = new Trees("New", 23, "brown", "male");
        newTree.printTreeType();
    }
}
