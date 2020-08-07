package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lottery {

	// static Map<Integer, Map<Integer, Map<Integer,String>>> knightMoves = new
	// HashMap<>();
	

	public static int lottery(int n) {
		List<Integer> l = Stream.iterate(1, (i)-> i+1).collect(Collectors.toList());
		System.out.println(l);
	/*	for (int i = 0; i < xPos.size(); i++) {
			
			int nextX = startRow + xPos.get(i);
			int nextY = startCol + yPos.get(i);
			
			
			if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < n) {
				System.out.println( "start " +startRow + " end " + startCol + " next " + nextX+ " nextc " +nextY );
				if (!knightMoves.containsKey(nextX))
					knightMoves.put(nextX, new HashMap<>());

				if (!knightMoves.get(nextX).containsKey(nextY))
					knightMoves.get(nextX).put(nextY, 0);
				
				if (!knightMoves.containsKey(startRow))
					knightMoves.put(startRow, new HashMap<>());

				if (!knightMoves.get(startRow).containsKey(startCol))
					knightMoves.get(startRow).put(startCol, 0);

				Integer currentNodeData = knightMoves.get(startRow).get(startCol);
				Integer nextNodeData = knightMoves.get(nextX).get(nextY);
				if (currentNodeData == null) {
					currentNodeData = 0;
					knightMoves.get(startRow).put(startCol, 0);
				}
				if (nextNodeData == null) {
					nextNodeData = 0;
					knightMoves.get(nextX).put(nextY, 0);
				}

				if (nextNodeData == 0 || nextNodeData > currentNodeData + 1)
					knightMoves.get(nextX).put(nextY, currentNodeData + 1);
				if(nextX<= endRow)
					minMoves(n, nextX, nextY, endRow, endCol);
			} else {
				continue;
			}

		}*/

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lottery(6));
	}

}
