public class Map {
    private int[][] model = new int[][]{
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
    };

    public int height() {
        return model.length;
    }

    public int width() {
        return model[0].length;
    }

    public void renderMap(Form form){
        for (int y=0; y<this.height(); y++)
        {
            for (int x=0; x<this.width(); x++)
            {
                if(x == form.getAx() && y == form.getAy())
                {
                    System.out.print("O");
                }
                else if(x == form.getBx() && y == form.getBy())
                {
                    System.out.print("O");
                }
                else if(x == form.getCx() && y == form.getCy())
                {
                    System.out.print("O");
                }
                else if(x == form.getDx() && y == form.getDy())
                {
                    System.out.print("O");
                }
                else if(model[y][x] == 0)
                    System.out.print("-");
                else System.out.print("0");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    };



    public int[][] getModel() {
        return model;
    }

    public int getElemenOfModel(int y, int x){
        return model[y][x];
    }

    public void setModel(int[][] model) {
        this.model = model;
    }

    public void setElemenOfModel(int y, int x, int value){
        this.model[y][x] = value;
    }
}
