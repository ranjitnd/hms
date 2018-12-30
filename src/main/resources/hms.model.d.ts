// Generated using typescript-generator version 2.0.400 on 2018-09-15 11:05:55.

export interface Appointment {
    id: string;
    title: string;
    fromDate: Date;
    toDate: Date;
    type: string;
    patientId: string;
    issuerId: string;
    lastUpdated: Date;
}

export interface Complaint {
    title: string;
    duration: string;
    details: string;
    location: string;
    sensation: string;
    causation: string;
    concomitant: string;
    worse: string;
    better: string;
    lastUpdated: Date;
}

export interface Followup {
    id: string;
    notes: string;
    prescription: string;
    status: string;
    complaintCollection: Complaint[];
    remedy: Remedy;
    doctorId: string;
    kaseId: string;
    lastUpdated: Date;
}

export interface History {
    self: string;
    treatment: string;
    father: string;
    mother: string;
    brother: string;
    sister: string;
    lastUpdated: Date;
    pgrandMother: string;
    mgrandFather: string;
    mgrandMother: string;
    pgrandFather: string;
}

export interface Invoice {
    id: string;
    amount: number;
    date: Date;
    status: string;
    typ: string;
    doctorId: string;
    patientId: string;
    lastUpdated: Date;
}

export interface Kase {
    id: string;
    clinicalDiag: string;
    reports: string;
    drugs: string;
    lastUpdated: Date;
    doctor: User;
    patientId: string;
    phyGen: PhyGen;
    mind: Mind;
    history: History;
}

export interface Mind {
    details: string;
    lastUpdated: Date;
}

export interface Patient {
    id: string;
    firstName: string;
    lastName: string;
    address: string;
    phoneNo: string;
    emailId: string;
    gender: string;
    dateOfBirth: Date;
    age: number;
    maritalStatus: string;
    children: number;
    siblings: number;
    education: string;
    occupation: string;
    lastUpdated: Date;
}

export interface PhyGen {
    built: string;
    appetite: string;
    thirst: string;
    diet: string;
    foodDesires: string;
    foodAversion: string;
    foodDisagree: string;
    stool: string;
    urination: string;
    sleep: string;
    dreams: string;
    sweat: string;
    thermals: string;
    hobbies: string;
    sex: string;
    phyObservation: string;
    lastUpdated: Date;
    kase: Kase;
    mestruation: string;
}

export interface Remedy {
    acute: string;
    chronic: string;
    lastUpdated: Date;
}

export interface User {
    id: string;
    firstName: string;
    lastName: string;
    address: string;
    phoneNo: string;
    emailId: string;
    userRole: string;
    userId: string;
    password: string;
    lastUpdated: Date;
}
