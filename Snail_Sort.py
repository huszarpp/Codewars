def snail(snail_map):
    n = len(snail_map)
    snail = []
    
    if snail_map == [[]]:
        return snail
    
    h1 = 0
    v1 = 1
    h2 = 1
    v2 = 0
    while True:
        for a in range(h1, n - h1):
            snail.append(snail_map[h1][a])
        h1 += 1
        if n % 2 == 1 and h1 == int(n / 2 + 1):
            break
        
        for b in range(v1, n - v1 + 1):
            snail.append(snail_map[b][-v1])
        v1 += 1
            
        for c in range(n - h2 - 1, h2 - 2, -1):
            snail.append(snail_map[-h2][c])
        h2 += 1
        if n % 2 == 0 and h2 ==  int(n / 2 + 1):
            break
        
        for d in range(n - v2 - 2, v2, -1):
            snail.append(snail_map[d][v2])
        v2 += 1
    return snail
