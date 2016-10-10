package _310;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> leaves = new ArrayList<>();
        if(n <= 1) {
        	leaves.add(0);
            return leaves;
        }
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        
        for(int i = 0; i < n; i++) {
            graph.put(i, new HashSet<Integer>());
        }
        for(int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        
        for(int i = 0; i < n; i++) {
            if(graph.get(i).size() == 1) {
                leaves.add(i);
            }
        }
        
        while(n > 2) {
            n -= leaves.size();
            List<Integer> newLeaves = new ArrayList<>();
            for(int leaf : leaves) {
                for(int newLeaf : graph.get(leaf)) {
                    graph.get(leaf).remove(newLeaf);
                    graph.get(newLeaf).remove(leaf);
                    if(graph.get(newLeaf).size() == 1) {
                        newLeaves.add(newLeaf);
                    }
                }
            }
            leaves = newLeaves;
        }
        
        return leaves;
    }
}