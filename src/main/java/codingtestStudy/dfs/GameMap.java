package codingtestStudy.dfs;

import java.util.ArrayList;
import java.util.List;

public class GameMap {
    int minimum = Integer.MAX_VALUE;
    int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
    public static void main(String[] args) {

        GameMap gm = new GameMap();
        if(gm.maps[gm.maps.length-1][gm.maps[0].length-2] == 0 &&
            gm.maps[gm.maps.length-2][gm.maps[0].length-1] == 0
        ){
            gm.minimum = -1;
        }

        List<Integer> first = gm.down(gm.maps, 0);
        List<Integer> second = gm.side(gm.maps, first.get(0), first.get(1), first.get(2));

    }

    List<Integer> down(int[][] maps, int sum){
        List<Integer> room = new ArrayList<>();
        int i;
        for(i =0; i <maps.length; i++){
            if(maps[i][0] != 0 && i < maps.length){
                sum+=maps[i][0];
            }
        }
        room.add(0,sum);
        if(i != 0){
            room.add(1, i-2);
        } else {
            room.add(1, i);
        }
        room.add(2, 0);
        System.out.println("room "+ room);
        return room;
    }

    List<Integer> side(int[][] maps, int sum, int s, int e){
        List<Integer> room = new ArrayList<>();
        int i;
        for(i = e+1; i < maps[0].length; i++){
            if(maps[s][i] != 0 && i < maps[0].length){
                sum+=maps[s][e];
            } else {
                break;
            }
        }
        room.add(0, sum);
        room.add(1, s);
        if(i != 0){
            room.add(2, i-1);
        }else {
            room.add(2, 0);
        }
        System.out.println("room "+ room);
        return room;
    }

 /*   List<Integer> up(int[][] maps, int sum, int s, int e){
        List<Integer> room = new ArrayList<>();
        int i;
        for(i = s-1; i >= 0; i--){
            if()
        }

    }
*/



}
