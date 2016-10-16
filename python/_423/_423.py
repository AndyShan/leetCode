class Solution(object):
    def originalDigits(self, s):
        """
        :type s: str
        :rtype: str
        """
        d = {'e': 0, 'f': 0, "g": 0, "h": 0, "i": 0, "n": 0, "o": 0, "r": 0, "s": 0, "t": 0, "u": 0, "v": 0, "w": 0,
             "x": 0, "z": 0}
        for i in s:
            d[i] += 1
        res = []
        ress = ''
        cur = 0
        l = len(s)
        if d['z'] != 0:
            for i in range(d['z']):
                res.append(0)
            cur += 4 * d['z']
            if cur == l:
                res.sort()
                for i in res:
                    ress += str(i)
                return ress
            d['e'] -= d['z']
            d['r'] -= d['z']
            d['o'] -= d['z']
        if d['w'] != 0:
            for i in range(d['w']):
                res.append(2)
            cur += 3 * d['w']
            if cur == l:
                res.sort()
                for i in res:
                    ress += str(i)
                return ress
            d['t'] -= d['w']
            d['o'] -= d['w']
        if d['u'] != 0:
            for i in range(d['u']):
                res.append(4)
            cur += 4 * d['u']
            if cur == l:
                res.sort()
                for i in res:
                    ress += str(i)
                return ress
            d['f'] -= d['u']
            d['o'] -= d['u']
            d['r'] -= d['u']
        if d['x'] != 0:
            for i in range(d['x']):
                res.append(6)
            cur += 3 * d['x']
            if cur == l:
                res.sort()
                for i in res:
                    ress += str(i)
                return ress
            d['s'] -= d['x']
            d['i'] -= d['x']
        if d['g'] != 0:
            for i in range(d['g']):
                res.append(8)
            cur += 5 * d['g']
            if cur == l:
                res.sort()
                for i in res:
                    ress += str(i)
                return ress
            d['e'] -= d['g']
            d['i'] -= d['g']
            d['h'] -= d['g']
            d['t'] -= d['g']
        if d['f'] != 0:
            for i in range(d['f']):
                res.append(5)
            cur += 4 * d['f']
            if cur == l:
                res.sort()
                for i in res:
                    ress += str(i)
                return ress
            d['i'] -= d['f']
            d['v'] -= d['f']
            d['e'] -= d['f']
        if d['o'] != 0:
            for i in range(d['o']):
                res.append(1)
            cur += 3 * d['o']
            if cur == l:
                res.sort()
                for i in res:
                    ress += str(i)
                return ress
            d['n'] -= d['o']
            d['e'] -= d['o']
        if d['s'] != 0:
            for i in range(d['s']):
                res.append(7)
            cur += 5 * d['s']
            if cur == l:
                res.sort()
                for i in res:
                    ress += str(i)
                return ress
            d['e'] -= 2 * d['s']
            d['v'] -= d['s']
            d['n'] -= d['s']
        if d['n'] != 0:
            for i in range(d['n'] / 2):
                res.append(9)
            cur += 4 * (d['n'] / 2)
            if cur == l:
                res.sort()
                for i in res:
                    ress += str(i)
                return ress
            d['i'] -= d['n']
            d['e'] -= d['n']
        if d['t'] != 0:
            for i in range(d['t']):
                res.append(3)
            cur += 5 * d['t']
            if cur == l:
                res.sort()
                for i in res:
                    ress += str(i)
                return ress
