class Solution {
    public int[] findRedundantConnection(int[][] connections) {
        UnionFind disjointSet = new UnionFind(connections.length);
        for (int[] connection : connections) {
            int node1 = disjointSet.find(connection[0] - 1);
            int node2 = disjointSet.find(connection[1] - 1);
            if (node1 == node2) {
                return new int[] {connection[0], connection[1]};
            } else {
                disjointSet.union(node1, node2);
            }
        }
        return null;
    }

    static class UnionFind {
        private final int[] parentNodes;
        private final int[] treeRanks;
        public UnionFind(int size) {
            parentNodes = new int[size];
            treeRanks = new int[size];
            for (int i = 0; i < size; i++) {
                parentNodes[i] = i;
                treeRanks[i] = 1;
            }
        }

        public int find(int node) {
            if (parentNodes[node] != node) {
                parentNodes[node] = find(parentNodes[node]);
            }
            return parentNodes[node];
        }

        public void union(int node1, int node2) {
            int rootNode1 = find(node1);
            int rootNode2 = find(node2);
            if (rootNode1 != rootNode2) {
                if (treeRanks[rootNode1] > treeRanks[rootNode2]) {
                    parentNodes[rootNode2] = rootNode1;
                } else if (treeRanks[rootNode1] < treeRanks[rootNode2]) {
                    parentNodes[rootNode1] = rootNode2;
                } else {
                    parentNodes[rootNode2] = rootNode1;
                    treeRanks[rootNode1]++;
                }
            }
        }
    }
}
