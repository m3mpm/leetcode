class Solution:
    def convert(self, letter: str) -> int:
        match letter:
            case 'I':
                return 1
            case 'V':
                return 5
            case 'X':
                return 10
            case 'L':
                return 50
            case 'C':
                return 100
            case 'D':
                return 500
            case 'M':
                return 1000

    def check(self, s: str) -> bool:
        return True if self.convert(s[0]) >= self.convert(s[1]) else False

    def romanToInt(self, s: str) -> int:
        result: int = 0
        i: int = 0
        l: int = len(s)
        while i < l:
            if i < l - 1:
                if self.check(s[i:i + 2]):
                    result += self.convert(s[i])
                else:
                    result -= self.convert(s[i])
            else:
                result += self.convert(s[i])
            i += 1
        return result
