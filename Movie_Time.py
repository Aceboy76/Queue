from collections import deque

Movies = deque([])
Snacks = deque([])
for x in range(1, 4):
    M = input("Enter movie " + str(x) + " of 3: ")
    Movies.append(M)

for x in range(1, 4):
    S = input("Enter Snacks " +  str(x) + " of 3: ")
    Snacks.append(S)
newMovies = (','.join(Movies))
newSnacks = (','.join(Snacks))
print("Movies to watch are: " + newMovies)
print("Available snacks are: " + newSnacks)

for x in range(1, 4):
    print("------------------------------")
    eat = input("Press S everytime you finish a snack: ")
    if (eat.upper() =="S"):
        Snacks.popleft()
        newSnacks = (','.join(Snacks))
        print(newSnacks)
        if not Snacks:
            print("No more Snacks")
