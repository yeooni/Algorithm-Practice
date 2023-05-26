# 분모가 다른 분수의 계산을 편하게 해주는 함수     
from fractions import Fraction

def solution(denum1, num1, denum2, num2):
    f = Fraction(denum1, num1) + Fraction(denum2, num2)
    answer = [f.numerator, f.denominator]
    return answer