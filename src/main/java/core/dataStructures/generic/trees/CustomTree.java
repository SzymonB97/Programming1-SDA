package core.dataStructures.generic.trees;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

@Setter @Getter
class CustomTree<T> {

    private List<CustomTree<T>> children = new LinkedList<CustomTree<T>>();
    private CustomTree<T> parent = null;
    private T value;

    public CustomTree(T value) {
        this.value = value;
    }

    public CustomTree(CustomTree<T> parent, T value) {
        this.parent = parent;
        this.value = value;
    }

    public void addChild(T value) {
        CustomTree<T> child = new CustomTree<T>(value);
        child.setParent(this);
        this.children.add(child);
    }

    public void addChild(CustomTree<T> child) {
        child.setParent(this);
        this.children.add(child);
    }

    private void setParent(CustomTree<T> parent) {
        this.parent = parent;
    }

    public List<CustomTree<T>> getChildren() {
        return children;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean isRoot() {
        return (this.parent == null);
    }

    public boolean isLeaf() {
        return this.children.size() == 0;
    }

    public void removeParent() {
        this.parent = null;
    }

    public static void main(String[] args) {
        CustomTree<String> tree = new CustomTree<String>("Parent");

        tree.addChild(new CustomTree<String>("Child 1"));
        //tree.addChild(new CustomTree<String>("Child 2"));


        System.out.println(tree.getChildren());
        //System.out.println(tree.getValue());
    }
}
