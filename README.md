- ### **Раздел 1: Основы Java (Core Java)**
	* **Вопрос:** Чем `equals` отличается от `==`?
	* **Вопрос:** Можно ли создать экземпляр класса с приватным конструктором? Как?
	* **Вопрос:** Что такое lambda, в чем отличие от анонимных классов?
	* **Вопрос:** Какие есть преимущества у Stream API, а какие у обычных циклов?
	* **Вопрос:** Когда стоит использовать `LinkedList`, когда `ArrayList`, когда `HashMap`, когда `TreeMap`?
	* **Вопрос:** Отличие многопоточности от асинхронности, где следует что применять?
	* **Вопрос:** Какие минусы в языке есть для вас? Что вам не нравится в стандартной библиотеке Java?
	* **Задача (код):** Что вернет код `"25".compareTo("100")`?
	* **Задача (код):** Сложить данные двух массивов, исключив дубликаты.
	* **Задача (код):** Метод проверки PIN-кода (`PinTask`).

-
-
---
- ### **Раздел 2: Системы контроля версий и методологии**
	* **Вопрос:** Какими системами контроля версий вы пользовались? Методология работы с Git. Что вам нравится? Что удобнее, merge или rebase?
---

- ### **Раздел 3: Фреймворки и библиотеки**
	* **Вопрос:** Какие библиотеки и фреймворки вы использовали? Что вы притащили бы обязательно в новый проект? Что вам в них не нравится?
	* **Вопрос (Spring):** Что нужно, чтобы написать приложение на Spring минимально? Что нужно, чтобы класс с `@Configuration` оказался в контексте? Какие контексты есть?
	* **Вопрос (Spring Web):** Что нужно минимально сделать, чтобы отдать какой-то метод по HTTP в Spring? На основе чего работает Spring MVC? Есть ли способы не пользоваться сервлетами?
	* **Вопрос (Spring):** Сервис с 2 публичными методами, один с `@Transactional`, второй — без. Из второго вызываем первый. Как это работает?
	* **Вопрос (Reactive):** Реактивное программирование — что такое? Зачем? `Mono`/`Flux` — отличие.
---

- ### **Раздел 4: Работа с данными (ORM, Базы данных, Кэши)**
	* **Вопрос (Hibernate/JPA):** Есть 2 сущности, внутри первой ко второй есть отношение `@OneToMany`. Получаем список первых и в цикле обрабатываем списки вторых. Все ли нормально? Можно ли из EntityManager/метода в репозитории получить не entity?
	* **Вопрос (SQL/Блокировки):** Задача на обработку сообщений в конкурентной среде (таблица `messages`, несколько инстансов).
	* **Вопрос (MongoDB):** Что там с транзакциями? Как работает шардирование? Стоит ли сейчас использовать MongoDB, или можно взять PostgreSQL?
	* **Вопрос (Кэши):** Что лучше использовать для Java-приложений: Redis, Hazelcast, Ignite? Redis. Как можно конфигурировать кластер?
---

- ### **Раздел 5: Архитектура, Протоколы, Производительность**
	* **Вопрос (Протоколы):** Протоколы (HTTP, REST, SOAP, JMS). Можно ли считать HTTP де-факто синхронным интерфейсом? Если нет, то как его можно использовать для асинхронной обработки?
	* **Вопрос (Производительность):** У вас есть классическое CRUD веб-приложение. При высокой нагрузке оно начинает подвисать. Каковы наиболее вероятные причины? Как бы вы решали данную проблему?
	* **Вопрос (Сетевое взаимодействие):** Вам нужно узнать IP-адреса всех систем, которые обращаются в ваш HTTP-сервис. Что бы вы делали? А если клиенты не могут передавать заголовок с их IP?
	* **Вопрос (Архитектура):** Микросервисы против монолита.
	* **Вопрос (Проектирование):** Есть несколько сервисов: сервис для отправки SMS, сервис управления услугами. Необходимо спроектировать бизнес-процесс: раз в сутки выбирать абонентов, подключать услугу, отправлять сообщение.
---

- ### **Раздел 6: Инфраструктура и DevOps**
	* **Вопрос:** Кубернетес / Docker / Linux.
---

- ### **Раздел 7: Процессы разработки и командная работа**
	* **Вопрос (Опыт):** Когда вы присоединились к своей последней компании, на какой стадии находился проект? Были ли вы ответственны за выбор технологии? Если да, то почему выбрали именно эту технологию?
	* **Вопрос (Code Review):** Как происходил код-ревью? На что в первую очередь вы обращаете внимание? Кто ревьювил ваш код?
	* **Вопрос (Тестирование):** Реализована функция `calc`. Какие тесты будешь писать? Как?
	* **Вопрос (Менеджмент):** Вы заметили, что разработчик стал менее продуктивным. Что будешь делать?
	* **Вопрос (Менеджмент):** PO/менеджер говорит, что срочно надо сделать большую фичу вне очереди, придется перерабатывать. Что будешь делать? Как выбрать человека, если задачей должен заниматься один?
---

- ### **Раздел 8: Практические задачи на анализ и написание кода**
  
  **Задача 1: Проверка возможности продажи товара (`canSell`)**  
	* **Дано:** Классы `IceCream` и `Alcohol`. Требуется реализовать логику проверки продаж по часам с учетом обеденного перерыва и запрета на алкоголь.  
  
**Задача 2: Ревью кода (Контроллер)**
	* **Дано:** Код класса `myContoller` с аннотациями Spring и JAX-RS.
	* **Вопрос:** Что не так с этим кодом?  
  
**Задача 3: Ревью кода (Parser)**
	* **Дано:** Класс `Parser`, который читает файл, фильтрует символы и сохраняет слова в БД.
	* **Вопрос:** Проанализировать код и найти проблемы (безопасность, производительность, ресурсы, SQL-инъекции и т.д.).  
  
**Задача 4: Клиент для внешнего API (`ExternalApiClient`)**
	* **Дано:** Клиент, который получает токен и затем запрашивает данные.
	* **Вопрос:** Проанализировать код на предмет возможных улучшений (обработка ошибок, повторные попытки, кэширование токена и т.д.).  
  
**Задача 5: Создание экземпляра класса**
	* **Вопрос:** Можно ли создать экземпляр класса с приватным конструктором?
---

-
- Ссылка на лайвкодинг
  https://interview.cups.online/live-coding/?room=889ba2ca-0320-451a-9c25-ce37f2f0dacc  
- ### **Задача 2: Объединение коллекций без дубликатов**
  **Задача:** Сложить данные двух массивов/коллекций, исключив дубликаты.  
  
  ```java
  public List<Integer> collect(List<Integer> lst1, List<Integer> lst2) {
    // код тут
  }
  ```
  
---
- ### **Задача 3: Тестирование калькулятора**
  ```java
  /*
  * Выполняет одну из операций "+", "-", "/", "*" для переданных параметров
  * В любой непонятной ситуации, в т.ч. невозможность разделить нацело, бросается exception
  */
  public Integer calc(Integer a, Integer b, String operation);
  ```
  
  **Вопрос:** Какие тесты будешь писать? Как?  
---
- ### **Задача 4: Проверка возможности продажи товара**
  **Дано:**  
  ```java
  public class IceCream implements Product {};
  public abstract class Alcohol implements Product {
    int getAbv(); // крепость
  };
  ```
  
  **Требование:** Написать метод проверки, можем ли мы продать товар.  
  ```
  * 13:00 - 14:00 - обед (никакие продажи)
  * 20:00 - 08:00 - запрет на продажу крепкого алкоголя (>=40)
  * 23:00 - 08:00 - запрет на продажу любого алкоголя
  ```
  
  **Метод для реализации:**  
  ```java
  public boolean canSell(Product item, Integer hour) {
    // Date now = Date.from(Instant.now()); // Час получен через now.getHours();
    // код тут
  }
  ```
  
---
- ### **Задача 5: Ревью кода - REST Controller**
  **Код для анализа:**  
  ```java
  @Component
  @Path("/service")
  public class myContoller extends Serializable {
    private String requestData;
  
    @Autowired
    private ValidateService validateService;
    
    @Autowired
    private Storage storage;
    
    @GET
    @POST
    @Path("/execute")
    public String execute(final Request request) {
        requestData = request.getBody().toString();
        validate();
        save();
        return 'OK'
    }
    
    /*
     * Проверка данных на сервере валидации
     */
    private static void validate() {
        if (!validateService.validate(requestData)) {
            // ...
        }
    }
  }
  ```
  
  **Вопрос:** Что не так с этим кодом? (Найти как можно больше проблем)  
---
- ### **Задача 6: Рфакторинг**
  **Код для анализа:**  
  ```java
  class Parser {
    static private File file;
  
    static public void setFile(File file) {
        Parser.file = file;
    }
  
    public static String parse() throws Exception {
        Connection connection = DriverManager.getConnection(
            "jdbc:pg:@prodcution.internal/proddb", "prod", "prod");
        connection.setAutoCommit(true);
  
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String parsedText = "";
        String line;
        while ((line = reader.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                int charCode = line.codePointAt(i);
                // charCode >= A && charCode <= z || charCode == ' '
                if ((charCode > 0x41 && charCode < 0x7A) || charCode == 0x20) {
                    parsedText = parsedText + line.charAt(i);
                }
            }
        }
        
        Arrays.stream(parsedText.split("\\s"))
            .parallel()
            .forEach(word -> {
                try {
                    ResultSet resultSet = connection.prepareCall(
                        "select blocked_word from blocked_words").executeQuery();
                    Boolean blockedWordFound = false;
                    while (resultSet.next()) {
                        if (Objects.equals(resultSet.getString(1), word)) {
                            blockedWordFound = true;
                        }
                    }
                    if (!blockedWordFound) {
                        connection.prepareStatement(
                            "insert into data values ('" + word + "')").execute();
                    }
                } catch (SQLException ex) {
                    // игнорируем исключение
                }
            });
        return "SUCCESS";
    }
  }
  ```
  
  **Вопрос:** Найти проблемы в коде (безопасность, производительность, работа с ресурсами и т.д.)  
  
---
- ### **Задача 7: Spring Transactional**
  **Код для анализа:**  
  ```java
  @Entity
  public class Foo {
    @Id
    String id;
    LocalDateTime updatedAt;
  }
  
  @Repository
  interface FooRepository extends CrudRepository<Foo, String> {}
  
  class FooService {
    @Autowired FooRepository repository;
    @Autowired RestTemplate restTemplate;
    
    @Transactional
    public Foo update() {
        var foo = repository.findById("id").get();
        foo.updatedAt = LocalDateTime.now();
        return repository.save(foo);
    }
    
    public void updateAndNotify() {
        var updatedEntity = update();
        restTemplate.postForEntity("/external", updatedEntity, String.class);
    }
  }
  ```
  
  **Вопрос:** Как будет работать транзакция? Что произойдет, если вызов внешнего сервиса упадет с ошибкой?  
  
---
- ### **Задача 8: Hibernate N+1 и Stream API**
  **Код для анализа:**  
  ```java
  @Entity
  class Student {
    @Id String id;
    String group;
    @OneToMany List<Book> books;
  }
  
  @Entity
  class Book {
    @Id String id;
    String name;
  }
  
  @Repository
  interface StudentRepository extends CrudRepository<Student, String> {
    List<Student> findStudentByGroup(String group);
  }
  
  @Service
  class StudentService {
    @Autowired StudentRepository repository;
  
    String mostPopularBook(String group) {
        return repository.findStudentByGroup(group)
            .stream()
            .flatMap(s -> s.books.stream())
            .collect(Collectors.groupingBy(book -> book.name, Collectors.counting()))
            .entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .get();
    }
  }
  ```
  
  **Вопросы:**  
	1. Есть ли проблема с производительностью? Какая?
	2. Как можно оптимизировать этот код?
	3. Можно ли из EntityManager/метода в репозитории получить не entity объекты?
---

- ### **Задача 9: Рефакторинг**
  **Код для анализа:**  
  ```java
  class ExternalApiClient {
    private final RestTemplate restTemplate;
    private final String login, password;
  
    public ExternalApiClient(RestTemplate restTemplate, String login, String password) {
        this.restTemplate = restTemplate;
        this.login = login;
        this.password = password;
    }
  
    public List<String> getData(int id) {
        var token = getToken();
        var data = getData(id, token);
        if (data.getStatusCode().is2xxSuccessful()) {
            return data.getBody();
        } else {
            return List.of();
        }
    }
  
    private ResponseEntity<List<String>> getData(int id, String token) {
        return restTemplate.exchange(
            "/data/{id}",
            HttpMethod.GET,
            new HttpEntity<>(new MultiValueMapAdapter<>(
                Map.of("Authorization", List.of("Bearer " + token)))),
            new ParameterizedTypeReference<>() {},
            Map.of("id", id)
        );
    }
  
    private String getToken() {
        return restTemplate.postForObject(
            "/token",
            Map.of("login", login, "password", password),
            String.class
        );
    }
  }
  ```
  
  **Вопрос:** Какие проблемы есть в этом коде? Как можно его улучшить?  
  
---
- ### **Задача 10: Валидация PIN-кода**
  **Код для реализации:**  
  ```java
  class PinTask {
    public static void main(String[] args) {
        Stream.of("1234", "a123", "123456", "1234567")
            .map(PinTask::isPin)
            .forEach(System.out::println);
    }
  
    public static boolean isPin(String s) {
        // Реализовать метод
    }
  }
  ```
  
  **Требования к PIN-коду (нужно определить по тестовым данным):**  
- `"1234"` → `true`
- `"a123"` → `false` (содержит не цифры)
- `"123456"` → `true`
- `"1234567"` → `false` (неправильная длина)
  
  **Вопрос:** Реализовать метод `isPin` согласно неявным требованиям.  
  
---
- ### **Задача 11: Обработка сообщений в конкурентной среде**
  **SQL схема:**  
  ```sql
  create table messages(
    id uuid primary key,
    status text,
    address text,
    message text,
    send_after timestamp
  );
  ```
  
  **Бизнес-логика:**  
	1. Несколько инстансов приложения выбирают сообщения для отправки:
	  ```sql
select id, address, message
from messages
where
send_after < current_timestamp
and status = 'new';
	  ```
	2. Обработка сообщений...  
	3. Обновление статуса:
	  ```sql
update messages set status = 'success' where id in (...);
	  ```
**Вопрос:** Какие проблемы могут возникнуть при параллельной работе нескольких инстансов? Как их решить?
---
