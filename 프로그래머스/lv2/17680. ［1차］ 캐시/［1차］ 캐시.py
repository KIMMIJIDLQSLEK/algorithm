def solution(cacheSize, cities):
    cache=[]
    cnt=0
    

    for city in cities:
        city=city.upper()
        if cacheSize:
            if city in cache:
                cache.remove(city)
                cnt+=1
            else:
                if len(cache)>=cacheSize:
                    cache.pop(0)
                cnt+=5
            cache.append(city)

        else:
            cnt+=5
  
    return cnt