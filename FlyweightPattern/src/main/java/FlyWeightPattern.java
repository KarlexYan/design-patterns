/*
*   享元模式
*   意图：运用共享技术有效地支持大量细粒度的对象
* */
public class FlyWeightPattern {
    public static void main(String[] args) {
        // 实例化工厂
        PieceFactory factory = new PieceFactory();

        // 获得白棋，下白棋
        Piece whitePiece1 = factory.getPiece(0);
        System.out.println(whitePiece1); // WhitePiece@6d311334
        whitePiece1.draw(10,10);

        // 获得黑棋，下黑棋
        Piece blackPiece1 = factory.getPiece(1);
        System.out.println(blackPiece1); // BlackPiece@723279cf
        blackPiece1.draw(20,20);

        System.out.println("==================next round===================");

        // 获得白棋，下白棋，与第一个白棋是同一个对象
        Piece whitePiece2 = factory.getPiece(0);
        System.out.println(whitePiece2); // WhitePiece@6d311334
        whitePiece1.draw(30,30);

        // 获得黑棋，下黑棋，与第一个黑棋是同一个对象
        Piece blackPiece2 = factory.getPiece(1);
        System.out.println(blackPiece2); // BlackPiece@723279cf
        blackPiece1.draw(40,40);
    }
}


