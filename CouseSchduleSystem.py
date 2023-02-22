from collections import defaultdict

numberOfCourses = 5
prerequisites = { 1:[2,4], 2:[3,4], 3:[5], 4:[3], 5:[] }

#Dictionary that containing Adjacency List
graph = defaultdict(list)
for course, prereqs in prerequisites.items():
    for p in prereqs:
        graph[course].append(p)


FinalPath = []
visited = [False]*(numberOfCourses+1)



def dfs(crs):
    visited[crs] = True
    
    for neighbour in graph[crs]:
        if visited[neighbour] == False:
            dfs(neighbour)
            
    FinalPath.append(crs)
    
for i in range(1, numberOfCourses+1):
    if visited[i] == False:
        dfs(i)
    

FinalPath.reverse()
print("Final Training Plan that include all courses in the correct order")
for i in range(len(FinalPath)):
    if i != len(FinalPath)-1:
        print(" Course", FinalPath[i],  "-->",end="")
    else:
        print(" Course", FinalPath[i])