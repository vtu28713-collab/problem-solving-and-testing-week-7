class ParkingSystem(object):

    def __init__(self, big, medium, small):
        self.parking = [0, big, medium, small]

    def addCar(self, carType):
        if self.parking[carType] > 0:
            self.parking[carType] -= 1
            return True
        return False