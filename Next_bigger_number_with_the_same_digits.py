def next_bigger(n):
    n = list(str(n))
    i = j = len(n) - 1
    
    while i > 0 and n[i] <= n[i-1]:
        i -= 1
    
    if i == 0:
        return -1
    
    while n[j] <= n[i-1]:
        j -= 1
    
    n[i-1], n[j] = n[j], n[i-1]
    n[i:] = sorted(n[i:])
    
    return int("".join(n))
