from abc import ABC, abstractmethod

class Animale(ABC):
    
    @abstractmethod
    def emettiVerso(self):
        pass
    
    def dormi(self):
        print("Zzz...")

class Cane(Animale):
    
    def emettiVerso(self):
        print("Bau!")

class Gatto(Animale):
    
    def emettiVerso(self):
        print("Miao!")

animali = [Cane(), Gatto(), Cane(), Gatto()]

for animale in animali:
    animale.emettiVerso()
    animale.dormi()