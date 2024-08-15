| Classes            | Variables              | Methods                        | Scenario                          | Outcome              |
|--------------------|------------------------|--------------------------------|-----------------------------------|----------------------|
| `TodoList`         | `ArrayList<Task> Todo` | `add(Task task)`               | Task will be added                | true                 |
|                    |                        |                                | Task will not be added            | false                |
|                    |                        | `remove(Task task)`            | Task will be removed              | true                 |
|                    |                        |                                | Task will not be removed          | false                |
|                    |                        | `seeAll(tasks)`                | See all tasks                     | List                 |
|                    |                        |                                | No tasks are in the list          | Error message        |
|                    |                        | `seeAllAlpha(tasks)`           | See all in ascending order        | true                 |
|                    |                        |                                | See all in descending order       | false                |
|                    |                        | `searchTask(String taskTitel)` | Show the searched task            | Object               |
|                    |                        |                                | Searched task does not exist      | Error message        |
|                    |                        | `completeTasks()`              | Get all the complete tasks        | List                 |
|                    |                        |                                | No complete tasks exists          | Error message        |
|                    |                        | `incompleteTasks()`            | Get all the incomplete tasks      | List                 |
|                    |                        |                                | No incomplete tasks exists        | Error message        |
| `Task(int taskId)` | `int taskId`           | `setId()`                      | Set an Id to a task               | true                 |
|                    |                        |                                | taskId is not set to task         | false                |
|                    |                        | `getId()`                      | Get an Id from a task             | true                 |
|                    |                        |                                | Can´t get taskId                  | false, Error message |
|                    | `String taskTitel`     | `taskTitel(String)`            | Task gets a title                 | true                 |
|                    |                        |                                | Title was not set to the task     | false, Error message |
|                    |                        | `changeStatus()`               | Be able to change status          | true                 |
|                    |                        |                                | If the change does not go through | false, Error message |


