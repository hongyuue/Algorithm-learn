def mystery(a,b):
	if b==0:
		return 0
	if (b%2) == 0:
		return mystery(a+a,b/2)
	return mystery(a+a,b/2) +a

def mysteryM(a,b):
	if b==0:
		return 1
	if (b%2) == 0:
		return mystery(a*a,b/2)
	return mystery(a*a,b/2) * a

def f(n):
	if n == 0:
		return 0
	if n== 1:
		return 1
	return f(n-1) + f(n-2)

for n in xrange(0,100):
	print(str(n) + " " + str(f(n)))
