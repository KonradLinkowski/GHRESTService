# GitHub Repository Overview
## Endpoints
### GET /repositories/{owner}/{repository-name}
**Response**
```
{
  "fullName": "...",
  "description: "...",
  "cloneUrl": "...",
  "stars": 0,
  "createdAt": "..."
}
```
## Running
### Eclipse
```
git clone https://github.com/KonradLinkowski/GHRESTService.git
File -> Import -> Maven -> Existing Maven project
```
### Command line
```
git clone https://github.com/KonradLinkowski/GHRESTService.git
cd GHRESTService
./mvnw spring-boot:run
```