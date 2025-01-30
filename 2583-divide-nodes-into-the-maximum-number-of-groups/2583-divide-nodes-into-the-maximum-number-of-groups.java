class Solution {
    public int magnificentSets(int numNodes, int[][] connections) {

        Map<Integer, List<Integer>> adjacencyList = new HashMap<>();
        for (int i = 1; i <= numNodes; i++) {
            adjacencyList.put(i, new ArrayList<>());
        }

        for (int[] edge : connections) {
            int startNode = edge[0];
            int endNode = edge[1];
            adjacencyList.get(startNode).add(endNode);
            adjacencyList.get(endNode).add(startNode);
        }

        Map<Integer, List<Integer>> connectedComponents = new HashMap<>();
        Set<Integer> visitedNodes = new HashSet<>();
        int componentId = 1;

        for (int i = 1; i <= numNodes; i++) {
            if (visitedNodes.contains(i)) continue;
            visitedNodes.add(i);
            connectedComponents.put(componentId, new ArrayList<>());
            exploreComponent(componentId++, i, adjacencyList, connectedComponents, visitedNodes);    
        }

        int[] componentMaxReach = new int[componentId];
        int totalMaxReach = 0;

        for (int i = 1; i < componentId; i++) {
            for (int nodeInComponent : connectedComponents.get(i)) {

                int componentReach = exploreGraph(nodeInComponent, adjacencyList);
                if (componentReach == -1) return -1;
                componentMaxReach[i] = Math.max(componentMaxReach[i], componentReach);
            }
            totalMaxReach += componentMaxReach[i];
        }

        return totalMaxReach;
    }

    private void exploreComponent(int componentId, int currentNode, Map<Integer, List<Integer>> adjacencyList, Map<Integer, List<Integer>> connectedComponents, Set<Integer> visitedNodes) {
        connectedComponents.get(componentId).add(currentNode);
        for (int neighbor : adjacencyList.get(currentNode)) {
            if (visitedNodes.contains(neighbor)) continue;
            visitedNodes.add(neighbor);
            exploreComponent(componentId, neighbor, adjacencyList, connectedComponents, visitedNodes);
        }
    }

    private int exploreGraph(int startNode, Map<Integer, List<Integer>> adjacencyList) {
        int reachDistance = 0;
        Set<Integer> visitedNodes = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> currentLevel = new HashSet<>();
        
        queue.offer(startNode);
        visitedNodes.add(startNode);

        while (!queue.isEmpty()) {
            int nodesAtCurrentLevel = queue.size();
            Set<Integer> nextLevel = new HashSet<>();

            for (int i = 0; i < nodesAtCurrentLevel; i++) {
                int currentNode = queue.poll();

                for (int neighbor : adjacencyList.get(currentNode)) {
                    if (currentLevel.contains(neighbor)) return -1; // A node is colored differently (i.e., graph is not bipartite)
                    if (visitedNodes.contains(neighbor)) continue;
                    nextLevel.add(neighbor);
                    visitedNodes.add(neighbor);
                    queue.offer(neighbor);
                }
            }

            currentLevel = nextLevel;
            reachDistance++;
        }

        return reachDistance;
    }
}
