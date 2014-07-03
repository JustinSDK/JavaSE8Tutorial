package cc.openhome;

public class Exercise2 {
    public static void main(String[] args) {
        Maze maze = new Maze( 
                      new int[][]{{2, 2, 2, 2, 2, 2, 2}, 
                                  {0, 0, 0, 0, 0, 0, 2}, 
                                  {2, 0, 2, 0, 2, 0, 2}, 
                                  {2, 0, 0, 2, 0, 2, 2}, 
                                  {2, 2, 0, 2, 0, 2, 2}, 
                                  {2, 0, 0, 0, 0, 0, 2}, 
                                  {2, 2, 2, 2, 2, 0, 2}},
                      new Point(6, 5));
                  
        Mouse.go(maze, new Point(1, 0));
        if(!maze.isArrived()) {
            System.out.println("沒找到出口");
        }
        maze.print();
    }
}

class Point {
    final int x;
    final int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Maze {
    private int[][] maze;
    private Point end;
    
    Maze(int[][] maze, Point end) {
        this.maze = maze;
        this.end = end;
    }
    
    boolean isArrived() {
        return maze[end.x][end.y] == 1;
    }
    
    boolean isEmpty(Point p) { return maze[p.x][p.y] == 0; }
    void step(Point p) { maze[p.x][p.y] = 1; }
    void empty(Point p) { maze[p.x][p.y] = 0; }
    
    void print() {
        for(int i = 0; i < maze.length; i++) { 
            for(int j = 0; j < maze[0].length; j++) { 
                if(maze[i][j] == 2) 
                    System.out.print("█"); 
                else if(maze[i][j] == 1) 
                    System.out.print("◇"); 
                else 
                    System.out.print("  "); 
            } 
            System.out.println(); 
        }
    }
}

class Mouse {
    static void go(Maze maze, Point p) {
        maze.step(p);
        test(maze, new Point(p.x, p.y + 1));
        test(maze, new Point(p.x + 1, p.y));
        test(maze, new Point(p.x, p.y - 1));
        test(maze, new Point(p.x - 1, p.y));
        if(!maze.isArrived())
            maze.empty(p);
    }
    
    private static void test(Maze maze, Point p) {
        if(!maze.isArrived() && maze.isEmpty(p))
            go(maze, p);
    }
}