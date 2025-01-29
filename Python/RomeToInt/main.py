from unittest import case


def convert(letter: str) -> int:
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


def check(s: str) -> bool:
    return True if convert(s[0]) >= convert(s[1]) else False


def romeToInt(s: str) -> int:
    result: int = 0
    i: int = 0
    l: int = len(s)
    while i < l:
        if i < l - 1:
            if check(s[i:i + 2]):
                result += convert(s[i])
            else:
                result -= convert(s[i])
        else:
            result += convert(s[i])
        i += 1
    return result


def main() -> None:
    rome_number = input()

    allowed_letters: str = "IVXLCDM"

    if len(rome_number) < 1 or len(rome_number) > 15:
        raise ValueError("Please enter 1 - 15 rome number length")

    if len(rome_number.strip(allowed_letters)) != 0:
        raise TypeError("Please enter a valid rome number")

    print(romeToInt(rome_number))


if __name__ == "__main__":
    main()
