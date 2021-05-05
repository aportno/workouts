-- find the K'th element of a list. The first element in the list is number 1

elementAt :: [a] -> Int -> a
elementAt lst index = lst !! (index - 1)