import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SearchMaze {

    /*
    19.1
    */

    private static int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public static List<Tuple> searchMaze(List<List<Boolean>> maze, Tuple s, Tuple e) {
        List<Tuple> path = new ArrayList<>();
        maze.get(s.first).set(s.second, false);
        path.add(s);
        if (!dfs(maze, s, e, path)) {
            path.remove(path.size() - 1);
        }
        return path;
    }

    private static boolean dfs(List<List<Boolean>> maze, Tuple s, Tuple e, List<Tuple> path) {
        if (s.equals(e)) {
            return true;
        }
        for (int[] dir : dirs) {
            int newX = s.first + dir[0];
            int newY = s.second + dir[1];
            if (newX >= 0 && newX < maze.size() && newY >= 0 && newY < maze.get(0).size() && maze.get(newX).get(newY)) {
                Tuple newTuple = new Tuple(newX, newY);
                path.add(newTuple);
                maze.get(newX).set(newY, false);
                if (dfs(maze, newTuple, e, path)) {
                    return true;
                }
                path.remove(path.size() - 1);
            }
        }
        return false;
    }
}
