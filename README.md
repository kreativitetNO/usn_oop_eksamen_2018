# Kode fra kurset

Her er koden fra kurset og et par notater som det er viktig å få med seg.

Merk at selve koden fins i katalogen src/javakurs/usn2018/eksamen. Beklager dette, men det er sånn Java fungerer.

## Feil eller unøyaktigheter

### Konstruktører uten access modifiers
Jeg glemte å markere mange konstruktører som public mens vi holdt på. Som regel ønsker vi at konstruktører er public hvis ikke vi har noen spesiell grunn til at de ikke skal være det (ref: MediaDatabase Singleton pattern). Når du ikke markerer de som noe som helst (public, private, protected) får de noe som heter 'default' tilgjengelighet. Les mer om dette [her](http://tutorials.jenkov.com/java/access-modifiers.html#default-package-access-modifier).

### Protected i Java er litt spesielt...
I utgangspunktet burde - etter manges mening inkludert min egen - protected medlemmer bare være tilgjengelig fra samme klasse eller en subklasse, og det var vel også det jeg sa. Men i Java er alle protected medlemmer også tilgjengelig fra alle klasser i samme 'package'. Bruken av protected er generelt omdiskutert, men når det først er sånn i Java og dere kan få spørsmål om det på eksamen (som f.eks i 2019), tenkte jeg at det var viktig å si fra. Bøker som "[Clean Code](https://www.amazon.com/Clean-Code-Handbook-Software-Craftsmanship/dp/0132350882)" (som regnes som en programmeringsbibel i mange kretser) sier rett ut at protected ikke burde brukes i det hele tatt, men andre smarte sjeler mener noe annet. Det beste er å se ting fra begge sider og ta et velfundert valg selv.

### Lambdaer
Det ble kanskje litt på kvelden for å begynne å leke med noe ved hjelp av oppkonstruerte eksempler, men MediaDatabase inneholder nå en funksjon _processMediaSources_ som viser et greit eksempel på bruk av en funksjonell interface (Se DoSomethingWithMediaSource.java). Dette interfacet blir kalt gjennom lambdaer i Program.java. Se på koden nevnt her så skal lambdaer være ganske enkle å skjønne.

### Jenkov tutorials
Jeg anbefaler helt klart de korte og lettleste tutorials på tutorials.jenkov.com. Disse inkluderer en grunnleggende [Java tutorial](http://tutorials.jenkov.com/java/index.html) og en grunnleggende [JavaFX tutorial](http://tutorials.jenkov.com/javafx/index.html).

