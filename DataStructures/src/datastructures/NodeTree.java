
package datastructures;

public class NodeTree {
    private NodeTree Left;
    private NodeTree Rigth;
    private int id;

    public NodeTree(int id) {
        this.id = id;
    }
    public NodeTree getLeft() {
        return Left;
    }

    public void setLeft(NodeTree Left) {
        this.Left = Left;
    }

    public NodeTree getRigth() {
        return Rigth;
    }

    public void setRigth(NodeTree Rigth) {
        this.Rigth = Rigth;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
