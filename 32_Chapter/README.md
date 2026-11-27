# I/O 스트림
## 바이트 스트림
- 바이트 스트림 상위 클래스: InputStream, OutputStream
- 종류: FileInputStream(), FileOutputStream()
- 버퍼 사용 스트림: BufferedInputStream(), BufferedOutputStream()
- 데이터(자료형)에 따른 스트림: DataInputStream(), DataOutputStream()

- 인스턴스 저장: ObjectInputStream, ObjectOutputStream

## 문자 스트림
- 문자 스트림 상위 클래스: Reader, Writer
- 종류: FileReader(), FileWriter()
- 버퍼 사용 스트림: BufferedReader(), BufferedWriter()


## Questions & Answers
1. 문자만 저장되어 있는 파일을 복사하려고 한다. 이때 필요한 스트림은?

-> 기본적으로 파일 복사는 파일의 내용에 상관없이 있는 그대로의 바이트 정보가 저장된 파일을 하나 더 만드는 일. 따라서 바이트 스트림을 생성해서 복사하는 것이 원칙.

2. 자바 프로그램에서 문자 하나를 파일에 저장했다가 다시 읽어 들이려 한다. 이때 필요한 스트림은?

-> 파일에 문자를 저장하고 읽는 주체는 자바 프로그램. 따라서 문자를 유니코드로 저장하고 읽어 들이면 충분.(문자 스트림을 사용하면 불필요하게 문자의 인코딩을 변경)

3. 운영체제상에서 만든 텍스트 파일의 내용을 자바 프로그램에서 읽어서 출력한다. 이때 필요한 스트림은?

-> 운영체제상에서 만든 텍스트 파일은 원하는 내용을 담은 파일을 의미. 따라서 기본 문자 인코딩 방식을 따라야 함. 그러므로 문자 스트림을 생성.
