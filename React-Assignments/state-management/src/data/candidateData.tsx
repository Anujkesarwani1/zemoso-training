export const candidateData = [
    {
        "name": "Alice Smith",
        "adjudication": "-",
        "status": "Clear",
        "location": "Los Angeles",
        "date": "01/15/2022"
    },
    {
        "name": "Bob Johnson",
        "adjudication": "-",
        "status": "Consider",
        "location": "New York City",
        "date": "02/23/2022"
    },
    {
        "name": "Charlie Brown",
        "adjudication": "-",
        "status": "Clear",
        "location": "Chicago",
        "date": "03/05/2022"
    },
    {
        "name": "David Lee",
        "adjudication": "-",
        "status": "Consider",
        "location": "Houston",
        "date": "04/12/2022"
    },
    {
        "name": "Emily Nguyen",
        "adjudication": "-",
        "status": "Clear",
        "location": "Seattle",
        "date": "05/20/2022"
    },
    {
        "name": "Franklin Chen",
        "adjudication": "-",
        "status": "Clear",
        "location": "San Francisco",
        "date": "06/08/2022"
    },
    {
        "name": "Grace Kim",
        "adjudication": "-",
        "status": "Consider",
        "location": "Miami",
        "date": "07/14/2022"
    },
    {
        "name": "Henry Park",
        "adjudication": "-",
        "status": "Clear",
        "location": "Boston",
        "date": "08/02/2022"
    },
    {
        "name": "James Chen",
        "adjudication": "-",
        "status": "Consider",
        "location": "Seattle",
        "date": "09/08/2022"
    },
    {
        "name": "Linda Nguyen",
        "adjudication": "-",
        "status": "Clear",
        "location": "Houston",
        "date": "10/21/2022"
    },
    {
        "name": "Marcus Kim",
        "adjudication": "-",
        "status": "Consider",
        "location": "New York City",
        "date": "11/17/2022"
    },
    {
        "name": "Nina Patel",
        "adjudication": "-",
        "status": "Clear",
        "location": "San Francisco",
        "date": "12/03/2022"
    },
    {
        "name": "Oliver Davis",
        "adjudication": "-",
        "status": "Clear",
        "location": "Miami",
        "date": "01/12/2023"
    }
]

export function updateAdjudication(name: string, adjudication: string) {
    const candidateIndex = candidateData.findIndex(candidate => candidate.name === name);
    if (candidateIndex !== -1) {
        candidateData[candidateIndex].adjudication = adjudication;
    }
}

